import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllLoginComponent } from './component/all-login/all-login.component';
import { ContractorProfileComponent } from './component/contractor-profile/contractor-profile.component';
//  import { CustomerProfileComponent } from './component/customer-profile/customer-profile.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
<<<<<<< HEAD
<<<<<<< HEAD
=======
import { GroomingComponent } from './component/grooming/grooming.component';
>>>>>>> origin/cody
=======
import { GroomingComponent } from './component/grooming/grooming.component';
>>>>>>> origin/Aly
import { RegisterCustomerComponent } from './component/register-customer/register-customer.component';
import { RegisterComponent } from './component/register/register.component';



const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
<<<<<<< HEAD
  { path: 'component/dashboard', component: DashboardComponent },
  {path: 'component/register', component:RegisterComponent},
  {path: 'component/register-customer', component:RegisterCustomerComponent},
  {path: 'component/contractor-profile', component: ContractorProfileComponent},
<<<<<<< HEAD
  {path: 'component/customer-profile', component: CustomerProfileComponent},
  {path: 'component/all-login', component: AllLoginComponent},
=======
  {path: 'grooming', component: GroomingComponent}
  // {path: 'component/customer-profile', component: CustomerProfileComponent},

>>>>>>> origin/Aly

  
=======
  { path: 'dashboard', component: DashboardComponent },
  {path: 'register', component: RegisterComponent},
  { path: 'register-customer', component: RegisterCustomerComponent},
  {path: 'grooming', component: GroomingComponent}
>>>>>>> origin/cody
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
