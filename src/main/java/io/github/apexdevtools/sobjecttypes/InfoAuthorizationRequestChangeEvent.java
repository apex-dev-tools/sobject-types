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
