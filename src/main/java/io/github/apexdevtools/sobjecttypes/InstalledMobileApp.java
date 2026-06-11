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
public class InstalledMobileApp extends SObject {
	public static SObjectType$<InstalledMobileApp> SObjectType;
	public static SObjectFields$<InstalledMobileApp> Fields;

	public Id ConnectedApplicationId;
	public ConnectedApplication ConnectedApplication;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String Version;

	public InstalledMobileApp clone$() {throw new java.lang.UnsupportedOperationException();}
	public InstalledMobileApp clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InstalledMobileApp clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InstalledMobileApp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InstalledMobileApp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
