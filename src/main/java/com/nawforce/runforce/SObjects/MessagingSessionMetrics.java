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
public class MessagingSessionMetrics extends SObject {
	public static SObjectType$<MessagingSessionMetrics> SObjectType;
	public static SObjectFields$<MessagingSessionMetrics> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MessagingSessionId;
	public MessagingSession MessagingSession;
	public String MessagingSessionMetricType;
	public Integer MessagingSessionMetricValue;
	public String Name;
	public Datetime SystemModstamp;

	public MessagingSessionMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
