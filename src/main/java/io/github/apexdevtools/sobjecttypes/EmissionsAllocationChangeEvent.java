/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EmissionsAllocationChangeEvent extends SObject {
	public static SObjectType$<EmissionsAllocationChangeEvent> SObjectType;
	public static SObjectFields$<EmissionsAllocationChangeEvent> Fields;

	public Id AllocatedFromAccountId;
	public Account AllocatedFromAccount;
	public String AllocatedFromScope;
	public Id AllocatedToAccountId;
	public Account AllocatedToAccount;
	public String AllocatedToScope;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal Percentage;
	public String ReplayId;

	public EmissionsAllocationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmissionsAllocationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsAllocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsAllocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsAllocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
