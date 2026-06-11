/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class InsPolicyBillingInfoChangeEvent extends SObject {
	public static SObjectType$<InsPolicyBillingInfoChangeEvent> SObjectType;
	public static SObjectFields$<InsPolicyBillingInfoChangeEvent> Fields;

	public Integer BillDayOfMonth;
	public Id BillToContactId;
	public Contact BillToContact;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;

	public InsPolicyBillingInfoChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyBillingInfoChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyBillingInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyBillingInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyBillingInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
