package com.bio4j.model.relationships.citation.article;

import com.bio4j.model.Relationship;
import com.bio4j.model.RelationshipType;

import com.bio4j.model.uniprot.nodes.Person;
import com.bio4j.model.uniprot.nodes.Article;

/**
 *
 * @author Pablo Pareja <ppareja@era7.com>
 */
public interface ArticleAuthor extends Relationship <
  Article, Article.Type,
  ArticleAuthor, ArticleAuthor.Type,
  Person, Person.Type
> {
    
  public static enum Type implements RelationshipType <
    Article, Article.Type,
    ArticleAuthor, ArticleAuthor.Type,
    Person, Person.Type
  > {
    articleAuthor;
    public Type value() { return articleAuthor; }
    public Arity arity() { return Arity.manyToMany; }
    public Article.Type sourceType() { return Article.TYPE; }
    public Person.Type targetType() { return Person.TYPE; }

  }
    
}
