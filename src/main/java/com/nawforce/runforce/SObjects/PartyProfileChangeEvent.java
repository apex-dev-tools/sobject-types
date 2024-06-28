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
public class PartyProfileChangeEvent extends SObject {
	public static SObjectType$<PartyProfileChangeEvent> SObjectType;
	public static SObjectFields$<PartyProfileChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String BusLicIssAuthorityName;
	public String BusinessEntityCtryofInc;
	public String BusinessEntityCtryofRgstr;
	public Date BusinessEntityIncDate;
	public String BusinessEntityIncNumber;
	public String BusinessEntityPreviousNames;
	public Date BusinessEntityRgstrDate;
	public String BusinessEntityRgstrNumber;
	public String BusinessEntityTradeName;
	public String BusinessEntityType;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public String CountryOfDomicile;
	public String CountryofBirth;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditScore;
	public String CreditScoreProvider;
	public String CurrencyIsoCode;
	public Date DateOfBirth;
	public String EmploymentIndustry;
	public String EmploymentType;
	public String FirstName;
	public String FullName;
	public String FundSource;
	public String Gender;
	public Id HouseholdAccountId;
	public Account HouseholdAccount;
	public Id Id;
	public String Industry;
	public String IndustryClassificationCode;
	public Boolean IsAged;
	public Boolean IsBusEntyListonStockExch;
	public Boolean IsDisabled;
	public Boolean IsInstitutionalized;
	public Boolean IsLowIncome;
	public Boolean IsMedicaidEligible;
	public Boolean IsNetWorthHigh;
	public Boolean IsOffBoarded;
	public Boolean IsRecalculationRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Datetime LastProfileReviewDate;
	public Id LeadId;
	public Lead Lead;
	public String LegalEntityIdentifier;
	public String MiddleName;
	public String Name;
	public String Nationality;
	public Datetime NextProfileReviewDate;
	public String OffBoardingComments;
	public String OffBoardingReason;
	public Id OwnerId;
	public User Owner;
	public String Prefix;
	public String PrimaryEmail;
	public String PrimaryIdentificationName;
	public String PrimaryIdentifier;
	public String PrimaryIdentifierType;
	public String PrimaryPhone;
	public Id RelatedPartyProfileId;
	public PartyProfile RelatedPartyProfile;
	public String ReplayId;
	public String ResidentType;
	public String ReviewDecision;
	public String Stage;
	public String StockExchangeName;
	public String Suffix;
	public String SurnameAtBirth;
	public String TaxpayerIdentificationNumber;
	public String TaxpayerIdentificationType;
	public String Type;

	public PartyProfileChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartyProfileChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartyProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartyProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartyProfileChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
