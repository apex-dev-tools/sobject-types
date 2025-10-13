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
public class DecisionTableActionEvent extends SObject {
	public static SObjectType$<DecisionTableActionEvent> SObjectType;
	public static SObjectFields$<DecisionTableActionEvent> Fields;

	public String Action;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DecisionTable;
	public String DecisionTableApiName;
	public String EventUuid;
	public String ReplayId;
	public String Status;

	public DecisionTableActionEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableActionEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableActionEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableActionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableActionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
