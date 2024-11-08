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
public class BusinessProfileChangeEvent extends SObject {
	public static SObjectType$<BusinessProfileChangeEvent> SObjectType;
	public static SObjectFields$<BusinessProfileChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String BusinessOperatingName;
	public String BusinessStructure;
	public String BusinessTaxIdentifier;
	public Object ChangeEventHeader;
	public Integer ConsecWorkersCompCoverage;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer CreditTypesUsed;
	public String CurrencyIsoCode;
	public String Division;
	public Boolean HasDishonoredPolicies;
	public Boolean HasSufferedBankruptcy;
	public Boolean HasUncorrectedSafetyViolations;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Integer WorkersCompClaims;
	public Integer WorkersCompMedicalClaims;

	public BusinessProfileChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessProfileChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
