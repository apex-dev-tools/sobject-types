/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MacroInstruction extends SObject {
	public static SObjectType$<MacroInstruction> SObjectType;
	public static SObjectFields$<MacroInstruction> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MacroId;
	public Macro Macro;
	public String Name;
	public String Operation;
	public Integer SortOrder;
	public Datetime SystemModstamp;
	public String Target;
	public String Value;
	public String ValueRecord;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;

	public MacroInstruction clone$() {throw new java.lang.UnsupportedOperationException();}
	public MacroInstruction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MacroInstruction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MacroInstruction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MacroInstruction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
