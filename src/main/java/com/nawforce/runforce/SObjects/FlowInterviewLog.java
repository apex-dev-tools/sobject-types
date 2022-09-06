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
public class FlowInterviewLog extends SObject {
	public static SObjectType$<FlowInterviewLog> SObjectType;
	public static SObjectFields$<FlowInterviewLog> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FlowDeveloperName;
	public String FlowInterviewGuid;
	public String FlowLabel;
	public String FlowNamespace;
	public Integer FlowVersionNumber;
	public Id Id;
	public Decimal InterviewDurationInMinutes;
	public Datetime InterviewEndTimestamp;
	public Datetime InterviewStartTimestamp;
	public String InterviewStatus;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public FlowInterviewLogEntry[] FlowInterviewLogs;
	public FlowInterviewLogShare[] Shares;

	public FlowInterviewLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowInterviewLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterviewLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterviewLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterviewLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
