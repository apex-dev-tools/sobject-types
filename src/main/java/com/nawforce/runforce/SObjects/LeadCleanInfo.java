/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LeadCleanInfo extends SObject {
	public static SObjectType$<LeadCleanInfo> SObjectType;
	public static SObjectFields$<LeadCleanInfo> Fields;

	public Address Address;
	public Decimal AnnualRevenue;
	public String City;
	public Boolean CleanedByJob;
	public Boolean CleanedByUser;
	public String CompanyDunsNumber;
	public String CompanyName;
	public String ContactStatusDataDotCom;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DandBCompanyDunsNumber;
	public String DataDotComCompanyId;
	public String DataDotComId;
	public String Email;
	public String FirstName;
	public String GeocodeAccuracy;
	public Id Id;
	public String Industry;
	public Boolean IsDeleted;
	public Boolean IsDifferentAnnualRevenue;
	public Boolean IsDifferentCity;
	public Boolean IsDifferentCompanyDunsNumber;
	public Boolean IsDifferentCompanyName;
	public Boolean IsDifferentCountry;
	public Boolean IsDifferentCountryCode;
	public Boolean IsDifferentDandBCompanyDunsNumber;
	public Boolean IsDifferentEmail;
	public Boolean IsDifferentFirstName;
	public Boolean IsDifferentIndustry;
	public Boolean IsDifferentLastName;
	public Boolean IsDifferentNumberOfEmployees;
	public Boolean IsDifferentPhone;
	public Boolean IsDifferentPostalCode;
	public Boolean IsDifferentState;
	public Boolean IsDifferentStateCode;
	public Boolean IsDifferentStreet;
	public Boolean IsDifferentTitle;
	public Boolean IsFlaggedWrongAddress;
	public Boolean IsFlaggedWrongAnnualRevenue;
	public Boolean IsFlaggedWrongCompanyDunsNumber;
	public Boolean IsFlaggedWrongCompanyName;
	public Boolean IsFlaggedWrongEmail;
	public Boolean IsFlaggedWrongIndustry;
	public Boolean IsFlaggedWrongName;
	public Boolean IsFlaggedWrongNumberOfEmployees;
	public Boolean IsFlaggedWrongPhone;
	public Boolean IsFlaggedWrongTitle;
	public Boolean IsInactive;
	public Boolean IsReviewedAddress;
	public Boolean IsReviewedAnnualRevenue;
	public Boolean IsReviewedCompanyDunsNumber;
	public Boolean IsReviewedCompanyName;
	public Boolean IsReviewedDandBCompanyDunsNumber;
	public Boolean IsReviewedEmail;
	public Boolean IsReviewedIndustry;
	public Boolean IsReviewedName;
	public Boolean IsReviewedNumberOfEmployees;
	public Boolean IsReviewedPhone;
	public Boolean IsReviewedTitle;
	public Datetime LastMatchedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Id LastStatusChangedById;
	public User LastStatusChangedBy;
	public Datetime LastStatusChangedDate;
	public Decimal Latitude;
	public Id LeadId;
	public Lead Lead;
	public Decimal Longitude;
	public String Name;
	public Integer NumberOfEmployees;
	public String Phone;
	public String PostalCode;
	public String State;
	public String StateCode;
	public String Street;
	public Datetime SystemModstamp;
	public String Title;

	public LeadCleanInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public LeadCleanInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LeadCleanInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LeadCleanInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LeadCleanInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
