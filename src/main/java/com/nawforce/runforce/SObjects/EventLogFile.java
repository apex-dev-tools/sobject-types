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
public class EventLogFile extends SObject {
	public static SObjectType$<EventLogFile> SObjectType;
	public static SObjectFields$<EventLogFile> Fields;

	public Decimal ApiVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventType;
	public Id Id;
	public String Interval;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LogDate;
	public Blob LogFile;
	public String LogFileContentType;
	public String LogFileFieldNames;
	public String LogFileFieldTypes;
	public Decimal LogFileLength;
	public Integer Sequence;
	public Datetime SystemModstamp;

	public EventLogFile clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventLogFile clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventLogFile clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventLogFile clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventLogFile clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
