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
public class IdentityDocumentChangeEvent extends SObject {
	public static SObjectType$<IdentityDocumentChangeEvent> SObjectType;
	public static SObjectFields$<IdentityDocumentChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date ExpirationDate;
	public Id Id;
	public String IdDocumentType;
	public Date IssueDate;
	public String IssuingAuthority;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id RelatedLegalEntityId;
	public SObject RelatedLegalEntity;
	public String ReplayId;
	public Id VerifiedById;
	public User VerifiedBy;
	public Datetime VerifiedOn;

	public IdentityDocumentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdentityDocumentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdentityDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdentityDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdentityDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
