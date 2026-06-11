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
public class DelegatedAccountShare extends SObject {
	public static SObjectType$<DelegatedAccountShare> SObjectType;
	public static SObjectFields$<DelegatedAccountShare> Fields;

	public String AccessLevel;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public DelegatedAccount Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public DelegatedAccountShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public DelegatedAccountShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DelegatedAccountShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DelegatedAccountShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DelegatedAccountShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
