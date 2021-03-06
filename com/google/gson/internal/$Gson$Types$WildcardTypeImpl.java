package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class $Gson$Types$WildcardTypeImpl
  implements WildcardType, Serializable
{
  private static final long serialVersionUID;
  private final Type lowerBound;
  private final Type upperBound;

  public $Gson$Types$WildcardTypeImpl(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    if (paramArrayOfType2.length <= i)
    {
      int k = i;
      .Gson.Preconditions.checkArgument(k);
      if (paramArrayOfType1.length != i)
        break label88;
      int n = i;
      label29: .Gson.Preconditions.checkArgument(n);
      if (paramArrayOfType2.length != i)
        break label99;
      .Gson.Preconditions.checkNotNull(paramArrayOfType2[0]);
      .Gson.Types.access$000(paramArrayOfType2[0]);
      if (paramArrayOfType1[0] != Object.class)
        break label94;
    }
    while (true)
    {
      .Gson.Preconditions.checkArgument(i);
      this.lowerBound = .Gson.Types.canonicalize(paramArrayOfType2[0]);
      this.upperBound = Object.class;
      return;
      int m = 0;
      break;
      label88: int i1 = 0;
      break label29;
      label94: int j = 0;
    }
    label99: .Gson.Preconditions.checkNotNull(paramArrayOfType1[0]);
    .Gson.Types.access$000(paramArrayOfType1[0]);
    this.lowerBound = null;
    this.upperBound = .Gson.Types.canonicalize(paramArrayOfType1[0]);
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof Serializable)) && (.Gson.Types.equals(this, (Serializable)paramObject));
  }

  public Type[] getLowerBounds()
  {
    if (this.lowerBound != null)
    {
      Type[] arrayOfType = new Type[1];
      arrayOfType[0] = this.lowerBound;
      return arrayOfType;
    }
    return .Gson.Types.EMPTY_TYPE_ARRAY;
  }

  public Type[] getUpperBounds()
  {
    Type[] arrayOfType = new Type[1];
    arrayOfType[0] = this.upperBound;
    return arrayOfType;
  }

  public int hashCode()
  {
    if (this.lowerBound != null);
    for (int i = 31 + this.lowerBound.hashCode(); ; i = 1)
      return i ^ 31 + this.upperBound.hashCode();
  }

  public String toString()
  {
    if (this.lowerBound != null)
      return "? super " + .Gson.Types.typeToString(this.lowerBound);
    if (this.upperBound == Object.class)
      return "?";
    return "? extends " + .Gson.Types.typeToString(this.upperBound);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.internal..Gson.Types.WildcardTypeImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */