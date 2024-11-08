/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsuranceProfileChangeEvent extends SObject {
	public static SObjectType$<InsuranceProfileChangeEvent> SObjectType;
	public static SObjectFields$<InsuranceProfileChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Boolean IsAlcoholAbuser;
	public Boolean IsAlcoholConsumer;
	public Boolean IsDrugAbuser;
	public Boolean IsGoodDriver;
	public Boolean IsGoodStudent;
	public Boolean IsHighRiskOccupation;
	public Boolean IsLicenseSuspended;
	public Boolean IsTobaccoConsumer;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MajorCitationCount;
	public Integer MinorCitationCount;
	public String Name;
	public Integer NumberOfAccidents;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public InsuranceProfileChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceProfileChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
