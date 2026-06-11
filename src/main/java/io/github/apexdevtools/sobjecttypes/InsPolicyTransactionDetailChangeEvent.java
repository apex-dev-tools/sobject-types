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
public class InsPolicyTransactionDetailChangeEvent extends SObject {
	public static SObjectType$<InsPolicyTransactionDetailChangeEvent> SObjectType;
	public static SObjectFields$<InsPolicyTransactionDetailChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String ChargeType;
	public Decimal Commission;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Decimal Fee;
	public Id Id;
	public Id InsurancePolicyTransactionId;
	public InsurancePolicyTransaction InsurancePolicyTransaction;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentTransactionDetailId;
	public InsPolicyTransactionDetail ParentTransactionDetail;
	public Decimal Premium;
	public Id ReferenceObjectId;
	public SObject ReferenceObject;
	public Id ReferenceObjectVersionId;
	public SObject ReferenceObjectVersion;
	public String ReplayId;
	public Decimal Tax;

	public InsPolicyTransactionDetailChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyTransactionDetailChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyTransactionDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyTransactionDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyTransactionDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
