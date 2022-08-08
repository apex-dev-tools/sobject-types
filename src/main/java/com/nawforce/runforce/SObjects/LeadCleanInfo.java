/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LeadCleanInfo extends SObject {
	public static SObjectType$<LeadCleanInfo> SObjectType;
	public static SObjectFields$<LeadCleanInfo> Fields;

	public Address Address;
	public Decimal AnnualRevenue;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.Boolean CleanedByJob;
	public com.nawforce.runforce.System.Boolean CleanedByUser;
	public com.nawforce.runforce.System.String CompanyDunsNumber;
	public com.nawforce.runforce.System.String CompanyName;
	public com.nawforce.runforce.System.String ContactStatusDataDotCom;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String DandBCompanyDunsNumber;
	public com.nawforce.runforce.System.String DataDotComCompanyId;
	public com.nawforce.runforce.System.String DataDotComId;
	public com.nawforce.runforce.System.String Email;
	public com.nawforce.runforce.System.String FirstName;
	public com.nawforce.runforce.System.String GeocodeAccuracy;
	public Id Id;
	public com.nawforce.runforce.System.String Industry;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsDifferentAnnualRevenue;
	public com.nawforce.runforce.System.Boolean IsDifferentCity;
	public com.nawforce.runforce.System.Boolean IsDifferentCompanyDunsNumber;
	public com.nawforce.runforce.System.Boolean IsDifferentCompanyName;
	public com.nawforce.runforce.System.Boolean IsDifferentCountry;
	public com.nawforce.runforce.System.Boolean IsDifferentCountryCode;
	public com.nawforce.runforce.System.Boolean IsDifferentDandBCompanyDunsNumber;
	public com.nawforce.runforce.System.Boolean IsDifferentEmail;
	public com.nawforce.runforce.System.Boolean IsDifferentFirstName;
	public com.nawforce.runforce.System.Boolean IsDifferentIndustry;
	public com.nawforce.runforce.System.Boolean IsDifferentLastName;
	public com.nawforce.runforce.System.Boolean IsDifferentNumberOfEmployees;
	public com.nawforce.runforce.System.Boolean IsDifferentPhone;
	public com.nawforce.runforce.System.Boolean IsDifferentPostalCode;
	public com.nawforce.runforce.System.Boolean IsDifferentState;
	public com.nawforce.runforce.System.Boolean IsDifferentStateCode;
	public com.nawforce.runforce.System.Boolean IsDifferentStreet;
	public com.nawforce.runforce.System.Boolean IsDifferentTitle;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongAddress;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongAnnualRevenue;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongCompanyDunsNumber;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongCompanyName;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongEmail;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongIndustry;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongName;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongNumberOfEmployees;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongPhone;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongTitle;
	public com.nawforce.runforce.System.Boolean IsInactive;
	public com.nawforce.runforce.System.Boolean IsReviewedAddress;
	public com.nawforce.runforce.System.Boolean IsReviewedAnnualRevenue;
	public com.nawforce.runforce.System.Boolean IsReviewedCompanyDunsNumber;
	public com.nawforce.runforce.System.Boolean IsReviewedCompanyName;
	public com.nawforce.runforce.System.Boolean IsReviewedDandBCompanyDunsNumber;
	public com.nawforce.runforce.System.Boolean IsReviewedEmail;
	public com.nawforce.runforce.System.Boolean IsReviewedIndustry;
	public com.nawforce.runforce.System.Boolean IsReviewedName;
	public com.nawforce.runforce.System.Boolean IsReviewedNumberOfEmployees;
	public com.nawforce.runforce.System.Boolean IsReviewedPhone;
	public com.nawforce.runforce.System.Boolean IsReviewedTitle;
	public Datetime LastMatchedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LastName;
	public Id LastStatusChangedById;
	public User LastStatusChangedBy;
	public Datetime LastStatusChangedDate;
	public Decimal Latitude;
	public Id LeadId;
	public Lead Lead;
	public Decimal Longitude;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfEmployees;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PostalCode;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String Street;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Title;

	public LeadCleanInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public LeadCleanInfo clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LeadCleanInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LeadCleanInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LeadCleanInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
