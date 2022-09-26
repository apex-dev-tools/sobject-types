/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ProcessNode extends SObject {
	public static SObjectType$<ProcessNode> SObjectType;
	public static SObjectFields$<ProcessNode> Fields;

	public String Description;
	public String DeveloperName;
	public Id Id;
	public String Name;
	public Id ProcessDefinitionId;
	public ProcessDefinition ProcessDefinition;
	public Datetime SystemModstamp;

	public ProcessNode clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessNode clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessNode clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessNode clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessNode clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
