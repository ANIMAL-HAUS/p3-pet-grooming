export class User {
    id!: number;
    firstName!: string;
    lastName!: string;
    userName!: string;
    password!: string;
    userEnum!: Role;
    email!: string;
    address!:string; 
    aboutme!: string; 
    
  }
export enum Role {
  Contractor,
  Customer
}
// This is where we link up our backend