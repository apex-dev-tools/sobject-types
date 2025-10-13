/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PersnlExperience extends SObject {
	public static SObjectType$<PersnlExperience> SObjectType;
	public static SObjectFields$<PersnlExperience> Fields;

	public String Channel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataProviderId;
	public PersonalizationPoint DataProvider;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DeveloperName;
	public String DisplayLocation;
	public String ElementClickPath;
	public String ElementClickTag;
	public String EngagementDestination;
	public Integer ExitIntentDelay;
	public Id GroupDataRetrievalById;
	public DataGraph GroupDataRetrievalBy;
	public Id Id;
	public Boolean IsAllowedToRenderIfEmpty;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime PublishedDate;
	public Decimal ScrollPercentValue;
	public String Status;
	public Datetime SystemModstamp;
	public String TargetMethodType;
	public String WhenToTransform;

	public PersnlExperience clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersnlExperience clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersnlExperience clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersnlExperience clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersnlExperience clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
