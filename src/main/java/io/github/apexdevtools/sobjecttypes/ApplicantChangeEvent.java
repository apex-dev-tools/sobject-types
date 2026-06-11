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
public class ApplicantChangeEvent extends SObject {
	public static SObjectType$<ApplicantChangeEvent> SObjectType;
	public static SObjectFields$<ApplicantChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id ApplicationFormId;
	public ApplicationForm ApplicationForm;
	public Date BirthDate;
	public String BusinessEntityName;
	public Id BusinessEntityPrimCtctId;
	public SObject BusinessEntityPrimCtct;
	public String BusinessEntityType;
	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Email;
	public String FirstName;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public String MiddleName;
	public String Name;
	public Id PartyProfileId;
	public PartyProfile PartyProfile;
	public String Phone;
	public String PhoneType;
	public String ReplayId;
	public String Role;
	public String Salutation;
	public String Stage;
	public String Suffix;
	public String Type;
	public String UniqueReferenceNumber;

	public ApplicantChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApplicantChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApplicantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApplicantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApplicantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
