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
public class ActiveScratchOrgShare extends SObject {
	public static SObjectType$<ActiveScratchOrgShare> SObjectType;
	public static SObjectFields$<ActiveScratchOrgShare> Fields;

	public String AccessLevel;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public ActiveScratchOrg Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public ActiveScratchOrgShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrgShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrgShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrgShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrgShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
