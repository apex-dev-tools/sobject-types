/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Knowledge__DataCategorySelection extends SObject {
	public static SObjectType$<Knowledge__DataCategorySelection> SObjectType;
	public static SObjectFields$<Knowledge__DataCategorySelection> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataCategoryGroupName;
	public String DataCategoryName;
	public Id Id;
	public Boolean IsDeleted;
	public Id ParentId;
	public Knowledge__kav Parent;
	public Datetime SystemModstamp;

	public Knowledge__DataCategorySelection clone$() {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__DataCategorySelection clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__DataCategorySelection clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__DataCategorySelection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__DataCategorySelection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
