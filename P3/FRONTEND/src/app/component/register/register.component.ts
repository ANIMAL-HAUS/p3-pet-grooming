import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import {Days, Users } from '../../models/Users';
// import {eole } from '../../models/Users';

import { ServicesService } from 'src/app/service/services.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  firstName!: string;
  lastName!: string;
  userName!: string;
  password!:string;
  // userRole!: Role;
  email!: string;
  address!: string;
  aboutme!: string;

  users= {
    firstName: String,
  lastName: String,
  userName: String,
  password:String,
  
  email: String,
  address: String,
  aboutme: String,
  }

  @Input()
  user!: Users;
  
  

  @Output()
  userAddedEvent = new EventEmitter();

  days = ['Weekdays', 'Weekends', 'Anyday']
  times = ['Morning', 'Afternoon', 'Night', 'Anytime']
  services = ['Walking', 'Grooming', 'Daycare']

  constructor(private ServicesService: ServicesService,
    private router: Router) { }

  ngOnInit(): void {
    this.ServicesService.getContractors()
    .subscribe(res=>{
      this.users = res;
     })
    this.user = new Users();
    console.log('user:', this.user);

    

   
  }

  addContractor() {
    this.ServicesService.addContractor(this.user).subscribe(
      (user) => {
        this.userAddedEvent.emit();
        this.router.navigate(['component', 'contractor-profile']);
      }
    );
  }
 
  // click() {
  //   if(this.isChecked = true){
  //   this.router.navigateByUrl('/contractor-profile')
  //   }
  // }
}

