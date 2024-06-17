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
public class AccreditationChangeEvent extends SObject {
	public static SObjectType$<AccreditationChangeEvent> SObjectType;
	public static SObjectFields$<AccreditationChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String AccreditationRating;
	public String AccreditingBody;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Date LastFullSurveyDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Date LastOnsiteSurveyDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PractitionerId;
	public Contact Practitioner;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public String SubType;
	public String Type;

	public AccreditationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccreditationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccreditationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccreditationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccreditationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
