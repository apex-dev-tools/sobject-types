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
public class RegulatoryAuthApplication extends SObject {
	public static SObjectType$<RegulatoryAuthApplication> SObjectType;
	public static SObjectFields$<RegulatoryAuthApplication> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AmountPaid;
	public String ApplicationCategory;
	public String ApplicationType;
	public Datetime AppliedDate;
	public Datetime ApprovedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public String ImplementorType;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime PaymentDate;
	public Datetime RequirementsCompleteDate;
	public Datetime SystemModstamp;

	public RegulatoryAuthApplication clone$() {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryAuthApplication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryAuthApplication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryAuthApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryAuthApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
