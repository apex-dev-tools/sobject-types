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
public class HealthcareProviderChangeEvent extends SObject {
	public static SObjectType$<HealthcareProviderChangeEvent> SObjectType;
	public static SObjectFields$<HealthcareProviderChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String CaqhIdentifier;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public String EhrSystem;
	public Boolean HasCarrierContract;
	public Id Id;
	public Date InitialStartDate;
	public Boolean IsActive;
	public Boolean IsNotSearchable;
	public Boolean IsPrivacyLawEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OperatingCountryCode;
	public Id OwnerId;
	public User Owner;
	public Id PractitionerId;
	public Contact Practitioner;
	public String ProfessionalTitle;
	public String ProviderClass;
	public Id ProviderPhotoId;
	public ContentDocument ProviderPhoto;
	public String ProviderType;
	public Id ReferredByContactId;
	public Contact ReferredByContact;
	public Id RelatedUserId;
	public User RelatedUser;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Date SourceSystemModifiedDate;
	public String Status;
	public Date TerminationDate;
	public String TerminationReason;
	public Integer TotalLicensedBeds;

	public HealthcareProviderChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
