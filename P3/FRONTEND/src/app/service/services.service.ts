import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import{Users} from '../models/Users';

@Injectable({
  providedIn: 'root'
})
export class ServicesService {
  deleteUser: any;

  constructor(private httpClient:HttpClient) { }

  addUser(newUser: Users) {
    return this.httpClient.post<Users>('http://localhost:3000/gamego/authcontroller', newUser);   
  }
}
