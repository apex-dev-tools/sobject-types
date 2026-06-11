/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LinkedArticleHistory extends SObject {
	public static SObjectType$<LinkedArticleHistory> SObjectType;
	public static SObjectFields$<LinkedArticleHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Id LinkedArticleId;
	public LinkedArticle LinkedArticle;
	public Object NewValue;
	public Object OldValue;

	public LinkedArticleHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticleHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticleHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticleHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticleHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
