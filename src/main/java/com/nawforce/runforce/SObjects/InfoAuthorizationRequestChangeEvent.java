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
public class InfoAuthorizationRequestChangeEvent extends SObject {
	public static SObjectType$<InfoAuthorizationRequestChangeEvent> SObjectType;
	public static SObjectFields$<InfoAuthorizationRequestChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String CommunicationType;
	public Id ConsenterId;
	public SObject Consenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataUsePurposeId;
	public DataUsePurpose DataUsePurpose;
	public Datetime ExpirationDateTime;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Locale;
	public Id MultipartyInfoAuthRequestId;
	public MultipartyInfoAuthRequest MultipartyInfoAuthRequest;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PertainsToId;
	public SObject PertainsTo;
	public String ReplayId;
	public Datetime RequestedDateTime;
	public Id RequesterId;
	public SObject Requester;
	public String ResponseStatus;
	public Id SourceRecordId;
	public SObject SourceRecord;

	public InfoAuthorizationRequestChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthorizationRequestChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthorizationRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthorizationRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthorizationRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
