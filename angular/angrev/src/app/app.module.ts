import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './components/test/test.component';
import { EventtestComponent } from './components/eventtest/eventtest.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatInputModule} from '@angular/material/input';
import { StylebindComponent } from './components/stylebind/stylebind.component';
import { NgiftestComponent } from './components/ngiftest/ngiftest.component';
import { NgswitchtestComponent } from './components/ngswitchtest/ngswitchtest.component';
import { NgfortestComponent } from './components/ngfortest/ngfortest.component';
import { NgtracktestComponent } from './components/ngtracktest/ngtracktest.component';
import { HiddentableComponent } from './components/hiddentable/hiddentable.component';
import { PipetestComponent } from './components/pipetest/pipetest.component';
import { CustompipetestComponent } from './components/custompipetest/custompipetest.component';
import { TitlePipe } from './title.pipe';
import { InputchildComponent } from './components/child/inputchild/inputchild.component';
import { InputparentComponent } from './components/child/inputparent/inputparent.component';
import { SizerComponent } from './components/breakout/sizer/sizer.component';
import { NumboxComponent } from './components/breakout/numbox/numbox.component';
import { EmployeelistComponent } from './components/servicetest/employeelist/employeelist.component';
import { EmployeedetailComponent } from './components/servicetest/employeedetail/employeedetail.component';
import { HttpClientModule } from '@angular/common/http';
import { PostComponent } from './components/post/post.component';
import { PhotosComponent } from './components/photos/photos.component';







@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    EventtestComponent,
    StylebindComponent,
    NgiftestComponent,
    NgswitchtestComponent,
    NgfortestComponent,
    NgtracktestComponent,
    HiddentableComponent,
    PipetestComponent,
    CustompipetestComponent,
    TitlePipe,
    InputchildComponent,
    InputparentComponent,
    SizerComponent,
    NumboxComponent,
    EmployeelistComponent,
    EmployeedetailComponent,
    PostComponent,
    PhotosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})


export class AppModule { }
