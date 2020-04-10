import { Component, OnInit } from '@angular/core';
import { DictionaryService,IWord } from '../dictionary.service';
import { AuthService } from '../auth.service'
import { from } from 'rxjs';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.scss']
})
export class DictionaryPageComponent implements OnInit {

  listWord: IWord[] = []; 
  constructor( 
    public authService: AuthService ,
    private dictionaryService: DictionaryService ) { }

  ngOnInit() { 
  this.listWord = this.dictionaryService.getAll(); 
}


  

}
