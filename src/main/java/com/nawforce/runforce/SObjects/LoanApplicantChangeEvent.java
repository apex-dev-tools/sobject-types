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
public class LoanApplicantChangeEvent extends SObject {
	public static SObjectType$<LoanApplicantChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicantChangeEvent> Fields;

	public String ApplicantExtIdentifier;
	public String AsianRaceSubType;
	public String BorrowerType;
	public Object ChangeEventHeader;
	public String CitizenshipStatus;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DependentCount;
	public String DependentsAge;
	public String EthnicitySubType;
	public String EthnicityType;
	public String GenderType;
	public Boolean HasMilitaryService;
	public Id Id;
	public Boolean IsActiveMilitary;
	public Boolean IsJointCredit;
	public Boolean IsSurvivingMilitarySpouse;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String MaritalStatus;
	public Integer MilitaryTourExpirationMonth;
	public Integer MilitaryTourExpirationYear;
	public String Name;
	public String OtherAsianRaceSubType;
	public String OtherEthnicitySubType;
	public String OtherPacIslandSubType;
	public Id OwnerId;
	public User Owner;
	public String PacIslandSubType;
	public String PreferredLanguage;
	public String RaceType;
	public String ReplayId;
	public String TribeName;
	public Boolean WasActiveMilitary;
	public Boolean WasNonActivatedService;

	public LoanApplicantChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
