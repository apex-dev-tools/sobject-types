/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsurancePolicyParticipantChangeEvent extends SObject {
	public static SObjectType$<InsurancePolicyParticipantChangeEvent> SObjectType;
	public static SObjectFields$<InsurancePolicyParticipantChangeEvent> Fields;

	public Decimal BeneficiarySharePercentage;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Datetime EffectiveDate;
	public Date EffectiveFromDate;
	public Date EffectiveToDate;
	public Decimal EmployeeContribution;
	public Decimal EmployerContribution;
	public Datetime ExpirationDate;
	public Id Id;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Boolean IsActiveParticipant;
	public Boolean IsMinorBeneficiary;
	public Boolean IsPolicyholder;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LegalGuardianId;
	public Account LegalGuardian;
	public String Name;
	public String ParticipantCode;
	public String ParticipantName;
	public Id PrimaryParticipantAccountId;
	public Account PrimaryParticipantAccount;
	public Id PrimaryParticipantContactId;
	public Contact PrimaryParticipantContact;
	public Id ProductId;
	public Product2 Product;
	public Id RelatedInsPolicyParticipantId;
	public InsurancePolicyParticipant RelatedInsPolicyParticipant;
	public Id RelatedParticipantAccountId;
	public Account RelatedParticipantAccount;
	public Id RelatedParticipantContactId;
	public Contact RelatedParticipantContact;
	public String RelationshipToInsured;
	public String ReplayId;
	public String Role;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Decimal StandardFeeAmount;
	public Decimal StandardPremiumAmount;
	public Decimal StandardTaxAmount;
	public Decimal TermFeeAmount;
	public Decimal TermPremiumAmount;
	public Decimal TermTaxAmount;
	public Decimal TotalStandardAmount;
	public Decimal TotalTermAmount;

	public InsurancePolicyParticipantChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyParticipantChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
