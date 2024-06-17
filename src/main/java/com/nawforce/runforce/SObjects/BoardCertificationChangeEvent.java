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
public class BoardCertificationChangeEvent extends SObject {
	public static SObjectType$<BoardCertificationChangeEvent> SObjectType;
	public static SObjectFields$<BoardCertificationChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String BoardName;
	public String CertificationType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date CurrentCertificationDate;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Date ExpirationDate;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PractitionerId;
	public Contact Practitioner;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public Date TerminationDate;
	public String TerminationReason;

	public BoardCertificationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BoardCertificationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BoardCertificationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BoardCertificationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BoardCertificationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
