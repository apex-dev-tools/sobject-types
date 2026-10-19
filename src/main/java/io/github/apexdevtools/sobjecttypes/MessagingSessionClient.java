/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MessagingSessionClient extends SObject {
	public static SObjectType$<MessagingSessionClient> SObjectType;
	public static SObjectFields$<MessagingSessionClient> Fields;

	public String BrowserLanguage;
	public String BrowserName;
	public String ClientIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String IpAddress;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MessagingSessionId;
	public MessagingSession MessagingSession;
	public String Name;
	public String OperatingSystemName;
	public Datetime SystemModstamp;
	public String UserAgent;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public MessagingSessionClient clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionClient clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionClient clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionClient clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionClient clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
