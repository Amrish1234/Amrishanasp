import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
  
function _window() :any{
  return window;
}
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  get nativeWindow(): any {
  return _window();
}

  constructor(private http: HttpClient) { }
  base_Url = "http://localhost:9090/detail/post";
  addData(employee: any): Observable<Object> {
    return this.http.post(this.base_Url, employee);
  }
  getData(): Observable<Object>{
    return this.http.get("http://localhost:9090/detail/getData");
   }

  addDetail(employee: any): Observable<Object> {
    return this.http.post("http://localhost:9090/login/post", employee);
  }
  getDetail(): Observable<Object> {
    return this.http.get("http://localhost:9090/login/post");
  }
 
}
