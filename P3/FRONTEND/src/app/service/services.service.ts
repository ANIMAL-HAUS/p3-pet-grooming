import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import{Users} from '../models/Users';

@Injectable({
  providedIn: 'root'
})
export class ServicesService {
  deleteUser: any;

  constructor(private httpClient:HttpClient) { }

  addContractor(newUser: Users) {
    return this.httpClient.post<Users>('', newUser);   
  }

  addCustomer(newUser: Users) {
    return this.httpClient.post<Users>('', newUser);   
  }
  getUsers()
  {
    return this.httpClient.get<Users[]>('http://localhost:3000/gamego/usercontroller/getallusers');
  }
}
