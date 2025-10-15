/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class TrackedCommunicationChangeEvent extends SObject {
	public static SObjectType$<TrackedCommunicationChangeEvent> SObjectType;
	public static SObjectFields$<TrackedCommunicationChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CommunicatorReferenceId;
	public SObject CommunicatorReference;
	public Id ContextReferenceId;
	public SObject ContextReference;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime OccurrenceEndDateTime;
	public Datetime OccurrenceStartDateTime;
	public Id OwnerId;
	public User Owner;
	public String Priority;
	public String ReplayId;
	public Id RequesterReferenceId;
	public SObject RequesterReference;
	public String Status;
	public String StatusReason;
	public Id SubjectId;
	public SObject Subject;
	public String Type;

	public TrackedCommunicationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public TrackedCommunicationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TrackedCommunicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TrackedCommunicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TrackedCommunicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
