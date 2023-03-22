import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodoButtonDeleteAllComponent } from './modules/todo-button-delete-all/todo-button-delete-all.component';
import { TodoInputAddItensComponent } from './modules/todo-input-add-itens/todo-input-add-itens.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoButtonDeleteAllComponent,
    TodoInputAddItensComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
