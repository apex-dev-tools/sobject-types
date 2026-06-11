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
