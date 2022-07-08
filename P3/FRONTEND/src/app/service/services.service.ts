import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import{Users} from '../models/Users';
import {map, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServicesService {
  deleteUser: any;

  constructor(private httpClient:HttpClient) { }
  // getContractors()
  // {
  //   return this.httpClient.get<Users[]>('http://localhost:7200/petgrooming/usercontroller/getallcontractors');
  // }
  getContractors(){
    return this.httpClient.get<any>('http://localhost:7200/petgrooming/usercontroller/getallcontractors')
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  addContractor(newUser: Users) {
    return this.httpClient.post<Users>('http://localhost:7200/petgrooming/authcontroller/contractor', newUser);   
  }

//   getCustomers()
//   {
//     return this.httpClient.get<Users[]>('http://localhost:5000/petgrooming/usercontroller/getallcustomers');
//   }

//   addCustomer(newUser: Users) {
//     return this.httpClient.post<Users>('http://localhost:5000/petgrooming/authcontroller', newUser);   
//   }

//   getUsers()
//   {
//     return this.httpClient.get<Users[]>('http://localhost:5000/petgrooming/usercontroller/getallcontractors');
//   }

//   addUser(newUser: Users) {
//     return this.httpClient.post<Users>('http://localhost:5000/petgrooming/authcontroller/contractor', newUser);   
//   }
}