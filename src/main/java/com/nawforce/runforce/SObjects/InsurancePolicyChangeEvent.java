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
public class InsurancePolicyChangeEvent extends SObject {
	public static SObjectType$<InsurancePolicyChangeEvent> SObjectType;
	public static SObjectFields$<InsurancePolicyChangeEvent> Fields;

	public String AuditTerm;
	public Id BillingCarrierAccountId;
	public Account BillingCarrierAccount;
	public Datetime CancellationDate;
	public String CancellationReason;
	public String CancellationReasonType;
	public Decimal CashSurrenderValue;
	public Object ChangeEventHeader;
	public String ChangeSubtype;
	public String ChangeType;
	public Id ContractGroupPlanId;
	public ContractGroupPlan ContractGroupPlan;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentDueAmount;
	public Datetime DateRenewed;
	public Decimal Discount;
	public String Division;
	public Datetime EffectiveDate;
	public Decimal EmployeeContribution;
	public Decimal EmployerContribution;
	public Datetime ExpirationDate;
	public Datetime FinalRenewalDate;
	public Decimal GrossWrittenPremium;
	public Boolean HasAnyAutoCoverage;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Id IntermediaryAccountId;
	public Account IntermediaryAccount;
	public Boolean IsActive;
	public Boolean IsLoanEligibile;
	public Boolean IsPolicyEditLocked;
	public Boolean IsRenewedPolicy;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id NameInsuredId;
	public Account NameInsured;
	public Datetime OriginalEffectiveDate;
	public Datetime OriginalExpirationDate;
	public Id OriginalPolicyId;
	public InsurancePolicy OriginalPolicy;
	public Id OwnerId;
	public User Owner;
	public Date PaidToDate;
	public Id ParentPolicyId;
	public InsurancePolicy ParentPolicy;
	public Decimal PastDueAmount;
	public Datetime PaymentDueDate;
	public String PlanTier;
	public String PlanType;
	public String PolicyDescription;
	public String PolicyName;
	public String PolicyTerm;
	public String PolicyType;
	public Decimal PremiumAmount;
	public String PremiumCalculationMethod;
	public String PremiumFrequency;
	public String PremiumPaymentType;
	public Decimal PreviousPremium;
	public Datetime PreviousRenewalDate;
	public Id PriorPolicyId;
	public InsurancePolicy PriorPolicy;
	public Id ProducerId;
	public Producer Producer;
	public Id ProductId;
	public Product2 Product;
	public Date RatingDate;
	public String ReferencePolicyNumber;
	public String RenewalChannel;
	public Datetime RenewalDate;
	public Id RenewedFromPolicyId;
	public InsurancePolicy RenewedFromPolicy;
	public String ReplayId;
	public Datetime SaleDate;
	public Address ServicingOffice;
	public String ServicingOfficeCity;
	public String ServicingOfficeCountry;
	public String ServicingOfficeCountryCode;
	public String ServicingOfficeGeocodeAccuracy;
	public Decimal ServicingOfficeLatitude;
	public Decimal ServicingOfficeLongitude;
	public String ServicingOfficePostalCode;
	public String ServicingOfficeState;
	public String ServicingOfficeStateCode;
	public String ServicingOfficeStreet;
	public Id SourceOpportunityId;
	public Opportunity SourceOpportunity;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Decimal StandardFeeAmount;
	public Decimal StandardPremiumAmount;
	public Decimal StandardTaxAmount;
	public String Status;
	public String Substatus;
	public Decimal TaxesSurcharges;
	public Decimal TermFeeAmount;
	public Decimal TermPremiumAmount;
	public Decimal TermTaxAmount;
	public Decimal TotalCommissionAmount;
	public Decimal TotalStandardAmount;
	public Decimal TotalSumInsured;
	public Decimal TotalTermFeeAmount;
	public Decimal TotalTermPremiumAmount;
	public Decimal TotalTermTaxAmount;
	public Id UnderwritingEntityId;
	public LegalEntity UnderwritingEntity;
	public String UniversalPolicyNumber;
	public Id WritingCarrierAccountId;
	public Account WritingCarrierAccount;

	public InsurancePolicyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
