import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingComponent } from './landing/landing.component';
import { ServersComponent } from './servers/servers.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { EventListComponent } from './home/event-list/event-list.component';
import { ProfileComponent } from './profile/profile.component';
import { EventCreatorComponent } from './home/event-creator/event-creator.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    ServersComponent,
    NavbarComponent,
    HomeComponent,
    EventListComponent,
    ProfileComponent,
    EventCreatorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
