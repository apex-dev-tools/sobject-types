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
public class JournalType extends SObject {
	public static SObjectType$<JournalType> SObjectType;
	public static SObjectFields$<JournalType> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProcessType;
	public Datetime SystemModstamp;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public JournalTypeHistory[] Histories;
	public JournalSubType[] JournalSubTypes;
	public TransactionJournal[] JournalType;
	public PromotionRuleTemplate[] JournalTypeTemplates;
	public LoyaltyProgramProcess[] LoyaltyProcessesJournalType;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public JournalTypeShare[] Shares;

	public JournalType clone$() {throw new java.lang.UnsupportedOperationException();}
	public JournalType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public JournalType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public JournalType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public JournalType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
