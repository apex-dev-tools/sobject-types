/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MktSgmtActvDataModelFld extends SObject {
	public static SObjectType$<MktSgmtActvDataModelFld> SObjectType;
	public static SObjectFields$<MktSgmtActvDataModelFld> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MarketSegmentActivationId;
	public MarketSegmentActivation MarketSegmentActivation;
	public String Name;
	public Datetime SystemModstamp;

	public MktSgmtActvDataModelFld clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvDataModelFld clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvDataModelFld clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvDataModelFld clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvDataModelFld clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
