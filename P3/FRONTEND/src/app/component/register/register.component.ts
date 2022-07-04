
import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import {Users } from '../../models/Users';
import {Role } from '../../models/Users';

import { ServicesService } from 'src/app/service/services.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  @Input()
  user!: Users;
  role!: Role;
  

  @Output()
  userAddedEvent = new EventEmitter();

  message!: string;
  password!: string;

  constructor(private ServicesService: ServicesService,
    private router: Router) { }

  ngOnInit(): void {
    console.log('user:', Users);

    
    

    console.log('role:', Role);
  }

  addContractor() {
    this.ServicesService.addContractor(this.user).subscribe(
      (user) => {
        this.userAddedEvent.emit();
        this.router.navigate(['component']);
      }
    );
  }
 
}
