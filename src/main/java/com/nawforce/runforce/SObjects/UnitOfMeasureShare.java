/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class UnitOfMeasureShare extends SObject {
	public static SObjectType$<UnitOfMeasureShare> SObjectType;
	public static SObjectFields$<UnitOfMeasureShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public UnitOfMeasure Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public UnitOfMeasureShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasureShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasureShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasureShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasureShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
