import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Users } from 'src/app/models/Users';
import { ServicesService } from 'src/app/service/services.service';

@Component({
  selector: 'app-customer-profile',
  templateUrl: './customer-profile.component.html',
  styleUrls: ['./customer-profile.component.css']
})
export class CustomerProfileComponent implements OnInit {
  
  users!: Array<Users>;
  action!: string;
  selectedUser!: Users;


  constructor(private ServicesService: ServicesService ,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.refreshData();
  }
  refreshData() {
    this.ServicesService.getContractors().subscribe(
      response => this.handleSuccessfulResponse(response),
    );

    this.activatedRoute.queryParams.subscribe(
      (params) => {
        this.action = params['action'];
        const selectedUserId = params['id'];
        if (selectedUserId) {
        }
      }
    );
  }
  
  viewCustomer(id: number) {
    this.router.navigate(['component', 'customer-profile'], {queryParams : {id, action: 'view'}});
  }

  handleSuccessfulResponse(response: Users[]) {
    this.users = response;
    console.log(this.users);
  }

  addCustomer() {
    this.selectedUser = new Users();
    this.router.navigate(['component', 'customer-profile'], { queryParams: { action: 'add' } });
  }

  
  }



