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
public class DatacloudPurchaseUsage extends SObject {
	public static SObjectType$<DatacloudPurchaseUsage> SObjectType;
	public static SObjectFields$<DatacloudPurchaseUsage> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DatacloudEntityType;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String PurchaseType;
	public Datetime SystemModstamp;
	public Decimal Usage;
	public Id UserId;
	public User User;
	public String UserType;

	public DatacloudPurchaseUsage clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatacloudPurchaseUsage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudPurchaseUsage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudPurchaseUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudPurchaseUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
