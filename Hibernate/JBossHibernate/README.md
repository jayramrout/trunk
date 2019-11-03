The annotation @JoinColumn indicates that this entity is the owner of 
the relationship (that is: the corresponding table has a column with a 
foreign key to the referenced table), whereas the attribute mappedBy 
indicates that the entity in this side is the inverse of the relationship, 
and the owner resides in the "other" entity. 
This also means that you can access the other table from the class 
which you've annotated with "mappedBy" (fully bidirectional relationship).