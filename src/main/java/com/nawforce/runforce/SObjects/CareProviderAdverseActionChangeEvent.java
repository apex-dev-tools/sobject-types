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
public class CareProviderAdverseActionChangeEvent extends SObject {
	public static SObjectType$<CareProviderAdverseActionChangeEvent> SObjectType;
	public static SObjectFields$<CareProviderAdverseActionChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id AccreditationId;
	public Accreditation Accreditation;
	public Date ActionIssueDate;
	public String ActionType;
	public Id BoardCertificationId;
	public BoardCertification BoardCertification;
	public Id BusinessLicenseId;
	public BusinessLicense BusinessLicense;
	public String CaseNumber;
	public Object ChangeEventHeader;
	public String CourtSentence;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Date IncidentDate;
	public Date IncidentReportedDate;
	public String InsurancePolicyNumber;
	public String InsuranceProviderName;
	public String Jurisdiction;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal PenaltyAmount;
	public Id PractitionerId;
	public Contact Practitioner;
	public String RegulatoryBody;
	public String RegulatoryBodyType;
	public String ReplayId;
	public String ReportingEntity;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;

	public CareProviderAdverseActionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProviderAdverseActionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderAdverseActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderAdverseActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderAdverseActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
